rootProject.name = "hexagonal-template"


enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("src:infrastructure")
findProject(":src:infrastructure")?.name = "infrastructure"

include("src:domain")
findProject(":src:domain")?.name = "domain"

include("src:application")
findProject(":src:application")?.name = "application"
