package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Hold the common fields for all payloads
 */
public class MIKEYPayload extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayload";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
        Interop.valueLayout.C_INT.withName("type"),
        Interop.valueLayout.C_INT.withName("len")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayload}
     * @return A new, uninitialized @{link MIKEYPayload}
     */
    public static MIKEYPayload allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayload newInstance = new MIKEYPayload(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.sdp.MIKEYPayloadType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYPayloadType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.sdp.MIKEYPayloadType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public int len$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void len$set(int len) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
    }
    
    /**
     * Create a MIKEYPayload proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYPayload(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.sdp.MIKEYPayloadType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_payload_new.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Make a new {@link MIKEYPayload} with {@code type}.
     * @param type a {@link MIKEYPayloadType}
     */
    public MIKEYPayload(@NotNull org.gstreamer.sdp.MIKEYPayloadType type) {
        super(constructNew(type), Ownership.FULL);
    }
    
    /**
     * Add a new sub payload to {@code payload}.
     * @param newpay a {@link MIKEYPayload} to add
     * @return {@code true} on success.
     */
    public boolean kemacAddSub(@NotNull org.gstreamer.sdp.MIKEYPayload newpay) {
        java.util.Objects.requireNonNull(newpay, "Parameter 'newpay' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_kemac_add_sub.invokeExact(
                    handle(),
                    newpay.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        newpay.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Get the number of sub payloads of {@code payload}. {@code payload} should be of type
     * {@link MIKEYPayloadType#KEMAC}.
     * @return the number of sub payloads in {@code payload}
     */
    public int kemacGetNSub() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_kemac_get_n_sub.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the sub payload of {@code payload} at {@code idx}. {@code payload} should be of type
     * {@link MIKEYPayloadType#KEMAC}.
     * @param idx an index
     * @return the {@link MIKEYPayload} at {@code idx}.
     */
    public @NotNull org.gstreamer.sdp.MIKEYPayload kemacGetSub(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_payload_kemac_get_sub.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.MIKEYPayload(RESULT, Ownership.NONE);
    }
    
    /**
     * Remove the sub payload at {@code idx} in {@code payload}.
     * @param idx the index to remove
     * @return {@code true} on success.
     */
    public boolean kemacRemoveSub(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_kemac_remove_sub.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the KEMAC parameters. {@code payload} should point to a {@link MIKEYPayloadType#KEMAC}
     * payload.
     * @param encAlg the {@link MIKEYEncAlg}
     * @param macAlg a {@link MIKEYMacAlg}
     * @return {@code true} on success
     */
    public boolean kemacSet(@NotNull org.gstreamer.sdp.MIKEYEncAlg encAlg, @NotNull org.gstreamer.sdp.MIKEYMacAlg macAlg) {
        java.util.Objects.requireNonNull(encAlg, "Parameter 'encAlg' must not be null");
        java.util.Objects.requireNonNull(macAlg, "Parameter 'macAlg' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_kemac_set.invokeExact(
                    handle(),
                    encAlg.getValue(),
                    macAlg.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the key validity period in the {@link MIKEYPayloadType#KEY_DATA} {@code payload}.
     * @param vfLen the length of {@code vf_data}
     * @param vfData the Valid From data
     * @param vtLen the length of {@code vt_data}
     * @param vtData the Valid To data
     * @return {@code true} on success
     */
    public boolean keyDataSetInterval(byte vfLen, @NotNull byte[] vfData, byte vtLen, @NotNull byte[] vtData) {
        java.util.Objects.requireNonNull(vfData, "Parameter 'vfData' must not be null");
        java.util.Objects.requireNonNull(vtData, "Parameter 'vtData' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_key_data_set_interval.invokeExact(
                    handle(),
                    vfLen,
                    Interop.allocateNativeArray(vfData, false),
                    vtLen,
                    Interop.allocateNativeArray(vtData, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set {@code key_len} bytes of {@code key_data} of type {@code key_type} as the key for the
     * {@link MIKEYPayloadType#KEY_DATA} {@code payload}.
     * @param keyType a {@link MIKEYKeyDataType}
     * @param keyLen the length of {@code key_data}
     * @param keyData the key of type {@code key_type}
     * @return {@code true} on success
     */
    public boolean keyDataSetKey(@NotNull org.gstreamer.sdp.MIKEYKeyDataType keyType, short keyLen, @NotNull byte[] keyData) {
        java.util.Objects.requireNonNull(keyType, "Parameter 'keyType' must not be null");
        java.util.Objects.requireNonNull(keyData, "Parameter 'keyData' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_key_data_set_key.invokeExact(
                    handle(),
                    keyType.getValue(),
                    keyLen,
                    Interop.allocateNativeArray(keyData, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the salt key data. If {@code salt_len} is 0 and {@code salt_data} is {@code null}, the
     * salt data will be removed.
     * @param saltLen the length of {@code salt_data}
     * @param saltData the salt
     * @return {@code true} on success
     */
    public boolean keyDataSetSalt(short saltLen, @Nullable byte[] saltData) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_key_data_set_salt.invokeExact(
                    handle(),
                    saltLen,
                    (Addressable) (saltData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(saltData, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the SPI/MKI validity in the {@link MIKEYPayloadType#KEY_DATA} {@code payload}.
     * @param spiLen the length of {@code spi_data}
     * @param spiData the SPI/MKI data
     * @return {@code true} on success
     */
    public boolean keyDataSetSpi(byte spiLen, @NotNull byte[] spiData) {
        java.util.Objects.requireNonNull(spiData, "Parameter 'spiData' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_key_data_set_spi.invokeExact(
                    handle(),
                    spiLen,
                    Interop.allocateNativeArray(spiData, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the PKE values in {@code payload}. {@code payload} must be of type
     * {@link MIKEYPayloadType#PKE}.
     * @param C envelope key cache indicator
     * @param dataLen the length of {@code data}
     * @param data the encrypted envelope key
     * @return {@code true} on success
     */
    public boolean pkeSet(@NotNull org.gstreamer.sdp.MIKEYCacheType C, short dataLen, @NotNull byte[] data) {
        java.util.Objects.requireNonNull(C, "Parameter 'C' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_pke_set.invokeExact(
                    handle(),
                    C.getValue(),
                    dataLen,
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the random values in a {@link MIKEYPayloadType#RAND} {@code payload}.
     * @param len the length of {@code rand}
     * @param rand random values
     * @return {@code true} on success
     */
    public boolean randSet(byte len, @NotNull byte[] rand) {
        java.util.Objects.requireNonNull(rand, "Parameter 'rand' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_rand_set.invokeExact(
                    handle(),
                    len,
                    Interop.allocateNativeArray(rand, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new parameter to the {@link MIKEYPayloadType#SP} {@code payload} with {@code type}, {@code len}
     * and {@code val}.
     * @param type a type
     * @param len a length
     * @param val {@code len} bytes of data
     * @return {@code true} on success
     */
    public boolean spAddParam(byte type, byte len, @NotNull byte[] val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_sp_add_param.invokeExact(
                    handle(),
                    type,
                    len,
                    Interop.allocateNativeArray(val, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the number of security policy parameters in a {@link MIKEYPayloadType#SP}
     * {@code payload}.
     * @return the number of parameters in {@code payload}
     */
    public int spGetNParams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_sp_get_n_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the Security Policy parameter in a {@link MIKEYPayloadType#SP} {@code payload}
     * at {@code idx}.
     * @param idx an index
     * @return the {@link MIKEYPayloadSPParam} at {@code idx} in {@code payload}
     */
    public @NotNull org.gstreamer.sdp.MIKEYPayloadSPParam spGetParam(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_payload_sp_get_param.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.MIKEYPayloadSPParam(RESULT, Ownership.NONE);
    }
    
    /**
     * Remove the Security Policy parameters from a {@link MIKEYPayloadType#SP}
     * {@code payload} at {@code idx}.
     * @param idx an index
     * @return {@code true} on success
     */
    public boolean spRemoveParam(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_sp_remove_param.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the Security Policy parameters for {@code payload}.
     * @param policy the policy number
     * @param proto a {@link MIKEYSecProto}
     * @return {@code true} on success
     */
    public boolean spSet(int policy, @NotNull org.gstreamer.sdp.MIKEYSecProto proto) {
        java.util.Objects.requireNonNull(proto, "Parameter 'proto' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_sp_set.invokeExact(
                    handle(),
                    policy,
                    proto.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the timestamp in a {@link MIKEYPayloadType#T} {@code payload}.
     * @param type the {@link MIKEYTSType}
     * @param tsValue the timestamp value
     * @return {@code true} on success
     */
    public boolean tSet(@NotNull org.gstreamer.sdp.MIKEYTSType type, @NotNull byte[] tsValue) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(tsValue, "Parameter 'tsValue' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_payload_t_set.invokeExact(
                    handle(),
                    type.getValue(),
                    Interop.allocateNativeArray(tsValue, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mikey_payload_new = Interop.downcallHandle(
            "gst_mikey_payload_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_kemac_add_sub = Interop.downcallHandle(
            "gst_mikey_payload_kemac_add_sub",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_kemac_get_n_sub = Interop.downcallHandle(
            "gst_mikey_payload_kemac_get_n_sub",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_kemac_get_sub = Interop.downcallHandle(
            "gst_mikey_payload_kemac_get_sub",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_kemac_remove_sub = Interop.downcallHandle(
            "gst_mikey_payload_kemac_remove_sub",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_kemac_set = Interop.downcallHandle(
            "gst_mikey_payload_kemac_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_key_data_set_interval = Interop.downcallHandle(
            "gst_mikey_payload_key_data_set_interval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_key_data_set_key = Interop.downcallHandle(
            "gst_mikey_payload_key_data_set_key",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_key_data_set_salt = Interop.downcallHandle(
            "gst_mikey_payload_key_data_set_salt",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_key_data_set_spi = Interop.downcallHandle(
            "gst_mikey_payload_key_data_set_spi",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_pke_set = Interop.downcallHandle(
            "gst_mikey_payload_pke_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_rand_set = Interop.downcallHandle(
            "gst_mikey_payload_rand_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_sp_add_param = Interop.downcallHandle(
            "gst_mikey_payload_sp_add_param",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_sp_get_n_params = Interop.downcallHandle(
            "gst_mikey_payload_sp_get_n_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_sp_get_param = Interop.downcallHandle(
            "gst_mikey_payload_sp_get_param",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_sp_remove_param = Interop.downcallHandle(
            "gst_mikey_payload_sp_remove_param",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_sp_set = Interop.downcallHandle(
            "gst_mikey_payload_sp_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_payload_t_set = Interop.downcallHandle(
            "gst_mikey_payload_t_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYPayload struct;
        
         /**
         * A {@link MIKEYPayload.Build} object constructs a {@link MIKEYPayload} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYPayload.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayload} struct.
         * @return A new instance of {@code MIKEYPayload} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYPayload construct() {
            return struct;
        }
        
        public Build setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
        
        /**
         * the payload type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.sdp.MIKEYPayloadType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * length of the payload
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLen(int len) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
            return this;
        }
    }
}
