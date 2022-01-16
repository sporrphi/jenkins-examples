pipeline{
    agent{
        label "master"
    }
    options {
        timeout(time: 30, unit: 'MINUTES')
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    parameters{
        string(name: "TESTCASE", defaultValue: "", description: "Enter testcase you want to execute.")
    }
    stages{
        stage("Testcase Executioner"){
            steps{
                echo "Executing Testcase ${params.TESTCASE}."
            }
        }
        stage("Simple Userinput"){
            steps{
                input message: "Continue to next stage?"
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