DESCRIPTION = "Communication package, WiFi, BT, etc"
LICENSE = "MIT"

include omega-image-core.bb

IMAGE_INSTALL_append += "packagegroup-base"
IMAGE_INSTALL_append += "packagegroup-system"
IMAGE_INSTALL_append += "packagegroup-communication"
