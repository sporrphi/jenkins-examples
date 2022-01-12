node ('agent-1') {
    properties([
        pipelineTriggers([
            upstream(
                threshold: hudson.model.Result.SUCCESS
                upstreamProjects: 'FIrst Example'
            )
        ])
    ])

    try {
        stage ('Source') {
            git 'https://github.com/sporrphi/test-repo.git'
        }
        stage ('Execute') {
            sh './test-repo/script1.sh'
        }
    } catch (err) {
        echo 'error'
    } finally {
        echo '****** Ende *************'
    }
}