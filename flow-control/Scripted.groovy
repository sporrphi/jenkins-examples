node() {
    def response

    stage('Timout Input') {
        timeout(time: 10, unit: 'SECONDS') {
            response = input message: 'User',
             parameters: [string(defaultValue: 'user1',
             description: 'Enter userid:', name: 'userid')]
        }
        echo "Username = " + response
    }

}