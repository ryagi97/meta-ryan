DESCRIPTION = "Package group for debug tools"
LICENCE = "MIT"
SUMMARY = "This package group adds various debug tools to the image"

inherit packagegroup

RDEPENDS:${PN} = "\
    gdb \
    gdbserver \
    valgrind \
    trace-cmd \
    perf \
"