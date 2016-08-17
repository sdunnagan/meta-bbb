require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "beaglebone"

RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_beaglebone = " \
    am335x-boneblack.dtb \
    bbb-hdmi.dtb \
    bbb-nohdmi.dtb \
    bbb-4dcape70t.dtb \
    bbb-nh5cape.dtb \
 "

LINUX_VERSION = "4.7"
LINUX_VERSION_EXTENSION = "-jumpnow"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-4.7:"

S = "${WORKDIR}/git"

PR = "r2"

# v4.7.1
SRCREV = "95f15f5ed6e68b479c73da842012108c567c6999"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.7.y \
    file://defconfig \
    file://0001-spidev-Add-a-generic-compatible-id.patch \
    file://0002-dts-Revoke-Beaglebone-i2c2-cape-definitions.patch \
    file://0003-Add-ft5x06_ts-touchscreen-driver.patch  \
    file://0004-dts-Add-custom-dts-files.patch \
 "
