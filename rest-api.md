- Site2
    - Get the certificate and key
    ```
    oc get secret sso-x509-https-secret -o jsonpath="{.data.tls\.crt}" | base64 --decode
    oc get secret sso-x509-https-secret -o jsonpath="{.data.tls\.key}" | base64 --decode
    ```


    - Acquire the access token using password grant type

    ```
    curl -k --location --request POST 'https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/realms/master/protocol/openid-connect/token' \
    --cert    sso.crt \
    --key     sso.key \
    --header 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'username=SbtW6JYK' \
    --data-urlencode 'password=buQqdem0vBnd6HvDWnThrVDtXFjbd4yi' \
    --data-urlencode 'grant_type=password' \
    --data-urlencode 'client_id=admin-cli'
    ```

    - Acquire the access token using client credentials grant type

    ```
    curl -k --location --request POST 'https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/realms/master/protocol/openid-connect/token' \
    --cert    sso.crt \
    --key     sso.key \
    --header 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'grant_type=client_credentials' \
    --data-urlencode 'client_id=admin-cli' \
    --data-urlencode 'client_secret=07a504c2-67c0-41bc-b254-8331fb6606b6'
    ```

    ```
    export TKN=$(curl -k -X POST "https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/realms/master/protocol/openid-connect/token" \
    --cert    sso.crt \
    --key     sso.key \
    -H "Content-Type: application/x-www-form-urlencoded" \
    -d 'grant_type=client_credentials' \
    -d 'client_secret=07a504c2-67c0-41bc-b254-8331fb6606b6' \
    -d 'client_id=admin-cli' | jq -r '.access_token')
    ```

- GET USERS

curl -k -X GET "https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/admin/realms/master/users/mriganka" \
--cert    sso.crt \
--key     sso.key \
-H "Accept: application/json" \
-H "Authorization: Bearer $TKN" 

- Create User

- client credentials
export TKN=$(curl -k -X POST "https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/realms/master/protocol/openid-connect/token" \
--cert    sso.crt \
--key     sso.key \
-H "Content-Type: application/x-www-form-urlencoded" \
-d 'grant_type=client_credentials' \
-d 'client_secret=07a504c2-67c0-41bc-b254-8331fb6606b6' \
-d 'client_id=admin-cli' | jq -r '.access_token')

- password
export TKN=$(curl -k -X POST "https://sso-rhdg-cluster.apps.ssosite2.fsi-partner.rhecoeng.com/auth/realms/master/protocol/openid-connect/token" \
--cert    sso.crt \
--key     sso.key \
-H "Content-Type: application/x-www-form-urlencoded" \
-d 'grant_type=password' \
-d 'username=SbtW6JYK' \
-d 'password=buQqdem0vBnd6HvDWnThrVDtXFjbd4yi' \
-d 'client_id=admin-cli' | jq -r '.access_token')



- Local host
export TKN=$(curl -k -X POST "http://localhost:8080/auth/realms/master/protocol/openid-connect/token" \
-H "Content-Type: application/x-www-form-urlencoded" \
-d 'grant_type=client_credentials' \
-d 'client_secret=eb8e8f48-3696-4791-aa1d-b171696f25af' \
-d 'client_id=admin-cli' | jq -r '.access_token')



export TKN=$(curl --location --request POST 'http://localhost:8080/auth/realms/master/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=admin-cli' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=admin' \
-d 'client_secret=eb8e8f48-3696-4791-aa1d-b171696f25af' \
--data-urlencode 'grant_type=password' | jq -r '.access_token')

curl --location --request POST 'http://localhost:8080/auth/realms/master/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=admin-cli' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=admin' \
-d 'client_secret=eb8e8f48-3696-4791-aa1d-b171696f25af' \
--data-urlencode 'grant_type=password'


export TKN=$(curl -k -X POST "http://localhost:8080/auth/realms/master/protocol/openid-connect/token" \
-H "Content-Type: application/x-www-form-urlencoded" \
-d 'grant_type=password' \
-d 'username=admin' \
-d 'password=admin' \
-d 'client_id=admin-cli' | jq -r '.access_token')

curl -k --location --request POST 'http://localhost:8080/auth/admin/realms/master/users' \
--header 'Content-Type: application/json' \
--header "Authorization: Bearer $TKN" \
--data-raw '{"firstName":"Sergey","lastName":"Kargopolov", "email":"test@test.com", "enabled":"true", "username":"app-user"}'


curl -k -X GET "http://localhost:8080/auth/admin/realms/master/users/" \
-H "Accept: application/json" \
-H "Authorization: Bearer $TKN" 