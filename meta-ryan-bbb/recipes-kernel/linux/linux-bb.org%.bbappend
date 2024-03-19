# 6.1.69 version for 32-bit
SRCREV:armv7a = "1eb6955fdc493dae5a85fd589848632669a3c42f"
PV:armv7a = "6.1.69+git${SRCPV}"
BRANCH:armv7a = "v6.1.69-ti-r22"

SRC_URI = " \
    git://github.com/ryagi97/bbb-linux.git;protocol=https;branch=${BRANCH} \
    file://defconfig \
"

