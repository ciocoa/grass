#!/bin/sh -l

if [ $GC_TZ ] && [ $GC_TZ != "false" ] && [ ! -f "/etc/timezone" ]; then

echo ">> Setting timezone..."

ln -s /usr/share/zoneinfo/$GC_TZ /etc/localtime

echo $GC_TZ > /etc/timezone

fi

if [ ! -d "./plugins/" ]; then

echo ">> Setting plugins..."

mkdir plugins

fi

if [ -f "./opencommand.jar" ]; then

mv opencommand.jar ./plugins/

fi

if [ ! -f "./keystore.p12" ]; then

echo ">> Generating CA key and certificate pair..."

mkdir certs

cd certs

openssl req -x509 -nodes -days 25202 -newkey rsa:2048 -subj "/C=GB/ST=Essex/L=London/O=Grasscutters/OU=Grasscutters/CN=$GC_ACCESS_ADDRESS" -keyout CAkey.key -out CAcert.crt

openssl genpkey -out ssl.key -algorithm rsa

cat > csr.conf <<EOF
[ req ]
default_bits = 2048
prompt = no
default_md = sha256
req_extensions = req_ext
distinguished_name = dn

[ dn ]
C = GB
ST = Essex
L = London
O = Grasscutters
OU = Grasscutters
CN = $GC_ACCESS_ADDRESS

[ req_ext ]
subjectAltName = @alt_names

[ alt_names ]
IP.1 = $GC_ACCESS_ADDRESS

EOF

openssl req -new -key ssl.key -out ssl.csr -config csr.conf

cat > cert.conf <<EOF
authorityKeyIdentifier = keyid, issuer
basicConstraints = CA:FALSE
keyUsage = digitalSignature, nonRepudiation, keyEncipherment, keyAgreement, dataEncipherment
subjectAltName = @alt_names

[alt_names]
IP.1 = $GC_ACCESS_ADDRESS

EOF

openssl x509 -req -in ssl.csr -CA CAcert.crt -CAkey CAkey.key -CAcreateserial -out ssl.crt -days 25202 -sha256 -extfile cert.conf

openssl pkcs12 -export -out keystore.p12 -inkey ssl.key -in ssl.crt -certfile CAcert.crt -passout pass:123456

cd ..

mv certs/keystore.p12 .

rm -rf certs

fi

if [ ! -f "./config.json" ]; then

echo ">> Generating configuration and configure..."

java -jar grasscutter.jar

sed -i 's#\("language": "\).*#\1'"$GC_LANGUAGE"'",#g' config.json

sed -i 's#\("accessAddress": "\).*#\1'"$GC_ACCESS_ADDRESS"'",#g' config.json

sed -i 's#\("bindPort": \)443#\1'$GC_BIND_PORT'#g' config.json

sed -i 's#\("autoCreate": "\).*#\1'$GC_AUTO_CREATE'",#g' config.json

sed -i 's#\("enableConsole": \).*#\1'$GC_ENABLE_CONSOLE',#g' config.json

sed -i 's#\("connectionUri": "\).*#\1'"$GC_MONGODB_URL"'",#g' config.json

fi

echo ">> Running server..."

java -jar grasscutter.jar
