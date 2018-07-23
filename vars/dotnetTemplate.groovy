def call(String podLabel, body) {
  podTemplate(
    cloud: 'kubernetes-dev',
    namespace: 'jenkins',
    label: podLabel,
    containers: [
        containerTemplate(
            name: 'dotnet',
            image: 'microsoft/dotnet',
            ttyEnabled: true,
            command: 'cat')
    ]) {
    body()
  }
}
