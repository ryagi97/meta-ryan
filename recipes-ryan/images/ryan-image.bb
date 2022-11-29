inherit core-image

SUMMARY = "Ryan's test yocto image"

#IMAGE_FEATURES += "ssh-server-dropbear read-only-rootfs splash"

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "usbutils hello-world shit-calc"

IMAGE_FSTYPES = "wic"

