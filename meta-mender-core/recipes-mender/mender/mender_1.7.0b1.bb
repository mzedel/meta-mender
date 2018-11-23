require mender.inc

################################################################################
#-------------------------------------------------------------------------------
# THINGS TO CONSIDER FOR EACH RELEASE:
# - SRC_URI (particularly "branch")
# - SRCREV
# - DEFAULT_PREFERENCE
#-------------------------------------------------------------------------------

SRC_URI = "git://github.com/mendersoftware/mender;protocol=https;branch=1.7.x"

# Tag: 1.7.0b1
SRCREV = "f63441b72e9d07db1114fa63f298563d2e812902"

# Enable this in Betas, not in finals.
# Downprioritize this recipe in version selections.
DEFAULT_PREFERENCE = "-1"

# REMOVE (not just comment) THIS FOR ALL NEW RECIPES!!!
# It's only here for old versions where we cannot change the source code.
GOPTESTBUILDFLAGS_append = " -vet=off"

################################################################################

# DO NOT change the checksum here without make sure that ALL licenses (including
# dependencies) are included in the LICENSE variable below.
LIC_FILES_CHKSUM = "file://src/github.com/mendersoftware/mender/LIC_FILES_CHKSUM.sha256;md5=debbe5e440f2e65465e86b25fc7c9fcc"
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & OLDAP-2.8"

