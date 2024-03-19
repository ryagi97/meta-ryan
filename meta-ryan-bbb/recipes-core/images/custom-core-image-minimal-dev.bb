require recipes-core/images/custom-core-image-minimal.bb

IMAGE_INSTALL:append = " \
    make \
    cmake \
"

IMAGE_INSTALL:append = " \
    git \
    htop \
    i2c-tools \
"
IMAGE_INSTALL:append = " \
    python3 \
    python3-pip \
"