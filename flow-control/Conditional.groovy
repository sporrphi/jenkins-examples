node('master') {
    def responses = null
    stage('selection') {
        responses = input message: 'Enter branch and select build type',
            parameters:[string(defaultValue: '', description: 'Branchname', name: 'BRANCH_NAME'),
            choice(choices: 'DEBUG\nRELEASE\nTEST', description: '', name: 'BUILD_TYPE')]
    }
    stage('process') {
        if((responses.BRANCH_NAME == 'main') &&
            (responses.BUILD_TYPE == 'RELEASE')) {
                echo "Building release."
            }
    }
}