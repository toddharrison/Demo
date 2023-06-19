plugins {
    id("demo.kotlin-common")
    id("demo.publish")
}

version = "1.0.1-SNAPSHOT"
description = ""

dependencies {
}

kover {
    verify {
        rule {
            bound {
                minValue = 50
                counter = kotlinx.kover.api.CounterType.LINE
                valueType = kotlinx.kover.api.VerificationValueType.COVERED_PERCENTAGE
            }
        }
    }
}
