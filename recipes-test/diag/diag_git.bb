SUMMARY = "DIAG implements routing of diagnostics related messages between host and various subsystems."
HOMEPAGE = "https://github.com/andersson/diag"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6832ae4af693c6f31ffd931e25ef580"

SRC_URI = "git://github.com/andersson/diag.git;protocol=https"

PV = "0.0+git${SRCPV}"
SRCREV = "9de0697ec5447dddbc0caf5744042e41a3a7c2ea"

S = "${WORKDIR}/git"

DEPENDS = "qrtr udev"

do_compile () {
	oe_runmake
}

do_install () {
	oe_runmake install 'DESTDIR=${D}'
}
