DESCRIPTION = "Simple hello-world C application"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://shit-calc.c \ 
           file://calc-func.c \
           file://calc-func.h \ 
           "

S = "${WORKDIR}"

do_compile () {
	bbwarn "Compilation started..."
	${CC} shit-calc.c calc-func.c ${LDFLAGS} -o shit-calc
	bbnote "Compilation complete"
}

do_install () {
	bbwarn "Installation started..."
	install -d ${D}${bindir}
	install -m 0755 shit-calc ${D}${bindir}
	bbnote "Installation complete"
}
