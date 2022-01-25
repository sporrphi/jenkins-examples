pipeline{
    agent any

    parameters {
        string(defaultValue: ''
                description: 'Branchname',
                name: 'BRANCH_NAME')
        choice(
            choices: 'DEBUG\nRELEASE\nTEST',
            desscription: '',
            name: 'BUILD_TYPE'
        )
    }

    stages{
        stage("Process"){
            when {
                allOf {
                    expression {params.BRANCH_NAME == 'main'}
                    expression {params.BUILD_TYPE == 'RELEASE'}
                }
            }
            steps{
                echo "Kicking of Release Build"
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}