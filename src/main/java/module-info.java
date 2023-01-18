// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.lib.tracerframework {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;
    requires webfx.lib.odometer;
    requires webfx.platform.arch;
    requires webfx.platform.console;
    requires webfx.platform.json;
    requires webfx.platform.os;
    requires webfx.platform.resource;
    requires webfx.platform.uischeduler;
    requires webfx.platform.useragent;
    requires webfx.platform.webworker;

    // Exported packages
    exports dev.webfx.lib.tracerframework;

    // Resources packages
    opens dev.webfx.lib.tracerframework;

}