properties([
    parameters([
        string(defaultValue: "main", description: "Enter branchname", name: "BRANCH"),
        string(name: "TESTCASE", defaultValue: "", description: "Enter testcase you want to execute.")
    ])
])

pipeline{
    agent{
        label "master"
    }
    options {
        timeout(time: 30, unit: 'MINUTES')
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    stages{
        stage("Fetch from Git") {
            steps{
                echo "Fetch from branch ${params.BRANCH}."
            }
        }
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