node('agent-1') {

    try {
        stage ('Execute') {
            sh './test-repo/script1.sh'
        }
    } catch (err) {
        echo 'error'
    } finally {
        echo '****** Ende *************'
    }
}