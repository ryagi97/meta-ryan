require recipes-core/images/core-image-minimal.bb

#
# USERS
#
# We leave the password empty which is unsafe, so we force the new users
# to create a new one on first login using the passwd-expire feature
#
inherit extrausers

USER1 = "ryagi"
GROUPS_USER1 = "tty,dialout,sudo"
SHELL_USER1 = "/bin/bash"

EXTRA_USERS_PARAMS = "\
    useradd -s ${SHELL_USER1} -m ${USER1}; \
    usermod -aG ${GROUPS_USER1} ${USER1}; \
    passwd-expire ${USER1}; \
"

RDEPENDS:{PN} += "\ 
    bash \
"