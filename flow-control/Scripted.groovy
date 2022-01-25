node('master') {
    def response

    stage('Timout Input') {
        try {
            timeout(time: 10, unit: 'SECONDS') {
                response = input message: 'User',
                parameters: [string(defaultValue: 'user1',
                description: 'Enter userid:', name: 'userid')]
            }
        } catch(err) {
            response = 'No user'
        }

        sleep time: 4, unit: 'SECONDS'
        
        echo "Username = " + response
    }



}