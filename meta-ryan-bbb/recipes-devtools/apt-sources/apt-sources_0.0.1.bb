DESCRIPTION = "Local apt sources"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\ 
    file://ryan-sources.list \
"

S = "${WORKDIR}"

APT_SOURCES_DIR = "${sysconfdir}/apt/sources.list.d"

do_install() {
	install -d ${D}${APT_SOURCES_DIR}
	install -m 0755 ryan-sources.list ${D}${APT_SOURCES_DIR}
}

RDEPENDS:${PN} += "\
    apt \
"
