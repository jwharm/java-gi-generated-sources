package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GLSL version list
 * @version 1.8
 */
public enum GLSLVersion implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no version
     */
    NONE(0),
    
    /**
     * version 100 (only valid for ES)
     */
    _100(100),
    
    /**
     * version 110 (only valid for compatibility desktop GL)
     */
    _110(110),
    
    /**
     * version 120 (only valid for compatibility desktop GL)
     */
    _120(120),
    
    /**
     * version 130 (only valid for compatibility desktop GL)
     */
    _130(130),
    
    /**
     * version 140 (only valid for compatibility desktop GL)
     */
    _140(140),
    
    /**
     * version 150 (valid for compatibility/core desktop GL)
     */
    _150(150),
    
    /**
     * version 300 (only valid for ES)
     */
    _300(300),
    
    /**
     * version 310 (only valid for ES)
     */
    _310(310),
    
    /**
     * version 320 (only valid for ES)
     */
    _320(320),
    
    /**
     * version 330 (valid for compatibility/core desktop GL)
     */
    _330(330),
    
    /**
     * version 400 (valid for compatibility/core desktop GL)
     */
    _400(400),
    
    /**
     * version 410 (valid for compatibility/core desktop GL)
     */
    _410(410),
    
    /**
     * version 420 (valid for compatibility/core desktop GL)
     */
    _420(420),
    
    /**
     * version 430 (valid for compatibility/core desktop GL)
     */
    _430(430),
    
    /**
     * version 440 (valid for compatibility/core desktop GL)
     */
    _440(440),
    
    /**
     * version 450 (valid for compatibility/core desktop GL)
     */
    _450(450);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSLVersion";
    
    private final int value;
    
    /**
     * Create a new GLSLVersion for the provided value
     * @param numeric value the enum value
     */
    GLSLVersion(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new GLSLVersion for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLSLVersion of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 100 -> _100;
            case 110 -> _110;
            case 120 -> _120;
            case 130 -> _130;
            case 140 -> _140;
            case 150 -> _150;
            case 300 -> _300;
            case 310 -> _310;
            case 320 -> _320;
            case 330 -> _330;
            case 400 -> _400;
            case 410 -> _410;
            case 420 -> _420;
            case 430 -> _430;
            case 440 -> _440;
            case 450 -> _450;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gstreamer.gl.GLSLVersion fromString(java.lang.String string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_glsl_version_from_string.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gl.GLSLVersion.of(RESULT);
        }
    }
    
    /**
     * Note: this function expects either a {@code #version} GLSL preprocesser directive
     * or a valid GLSL version and/or profile.
     * @param string a valid GLSL {@code #version} string
     * @param versionRet resulting {@link GLSLVersion}
     * @param profileRet resulting {@link GLSLVersion}
     * @return TRUE if a valid {@code #version} string was found, FALSE otherwise
     */
    public static boolean profileFromString(java.lang.String string, Out<org.gstreamer.gl.GLSLVersion> versionRet, Out<org.gstreamer.gl.GLSLProfile> profileRet) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment versionRetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment profileRetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_glsl_version_profile_from_string.invokeExact(
                        Marshal.stringToAddress.marshal(string, SCOPE),
                        (Addressable) versionRetPOINTER.address(),
                        (Addressable) profileRetPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    versionRet.set(org.gstreamer.gl.GLSLVersion.of(versionRetPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    profileRet.set(new org.gstreamer.gl.GLSLProfile(profileRetPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public static java.lang.String profileToString(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_version_profile_to_string.invokeExact(
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static @Nullable java.lang.String toString(org.gstreamer.gl.GLSLVersion version) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_version_to_string.invokeExact(version.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_glsl_version_from_string = Interop.downcallHandle(
                "gst_glsl_version_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_version_profile_from_string = Interop.downcallHandle(
                "gst_glsl_version_profile_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_glsl_version_profile_to_string = Interop.downcallHandle(
                "gst_glsl_version_profile_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_glsl_version_to_string = Interop.downcallHandle(
                "gst_glsl_version_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
