def deploy(String repo) {
 sh """
    docker pull ${repo}
    docker run -d --expose=3000 -p 3000:3000 ${repo} 
 """
}
