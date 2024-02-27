DESCRIPTION = "Silly apache2 webserver showing hedgehogs"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\ 
    file://index.html \
    file://httpd.conf \    
"

S = "${WORKDIR}"

APACHE2_DIR = "${sysconfdir}/apache2"
HEDGEHOG_WEBSERVER_DIR = "${sysconfdir}/hedgehog-webserver"

do_install() {
	install -d ${D}${APACHE2_DIR}
    install -d ${D}${HEDGEHOG_WEBSERVER_DIR}

	install -m 0755 httpd.conf ${D}${APACHE2_DIR}
    install -m 0755 index.html ${D}${HEDGEHOG_WEBSERVER_DIR}
}

RDEPENDS:${PN} += "\
    apache2 \
"
