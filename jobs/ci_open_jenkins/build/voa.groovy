package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtLibraryJobBuilder('play-conditional-form-mapping').
        build(this as DslFactory)

new SbtFrontendJobBuilder('for-frontend')
        .build(this as DslFactory)

new SbtMicroserviceJobBuilder('cca-challenge').withTests("test")
       .build(this as DslFactory)


