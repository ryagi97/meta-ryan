require recipes-core/images/core-image-minimal.bb

#
# USERS
#
inherit extrausers

PASSWORD = "\$5\$q13sD.Md0ZvJDIny\$s8cyCVPlRb1reIaFAzX2BW4tGdYYl1NaUe9tjrDegE2"
USERNAME = "ryagi"
GROUPS = "tty,dialout,sudo"
SHELL = "/bin/bash"

EXTRA_USERS_PARAMS = "\
    useradd -p ${PASSWORD} -s ${SHELL} -m ${USERNAME}; \
    usermod -aG ${GROUPS} ${USERNAME}; \
    passwd-expire ${USERNAME}; \
"