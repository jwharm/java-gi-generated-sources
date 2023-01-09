package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Stores probabilities updates. This is from the spec
 * and can be used as a binary.
 * @version 1.20
 */
public class Vp9DeltaProbabilities extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9DeltaProbabilities";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("tx_probs_8x8"),
            MemoryLayout.paddingLayout(16),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("tx_probs_16x16"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(6, Interop.valueLayout.C_BYTE).withName("tx_probs_32x32"),
            MemoryLayout.paddingLayout(13680),
            MemoryLayout.sequenceLayout(1728, Interop.valueLayout.C_BYTE).withName("coef"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_BYTE).withName("skip"),
            MemoryLayout.paddingLayout(48),
            MemoryLayout.sequenceLayout(21, Interop.valueLayout.C_BYTE).withName("inter_mode"),
            MemoryLayout.paddingLayout(16),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.C_BYTE).withName("interp_filter"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("is_inter"),
            MemoryLayout.sequenceLayout(5, Interop.valueLayout.C_BYTE).withName("comp_mode"),
            MemoryLayout.paddingLayout(40),
            MemoryLayout.sequenceLayout(10, Interop.valueLayout.C_BYTE).withName("single_ref"),
            MemoryLayout.sequenceLayout(5, Interop.valueLayout.C_BYTE).withName("comp_ref"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.sequenceLayout(36, Interop.valueLayout.C_BYTE).withName("y_mode"),
            MemoryLayout.paddingLayout(288),
            MemoryLayout.sequenceLayout(48, Interop.valueLayout.C_BYTE).withName("partition"),
            org.gstreamer.codecs.Vp9MvDeltaProbs.getMemoryLayout().withName("mv")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9DeltaProbabilities}
     * @return A new, uninitialized @{link Vp9DeltaProbabilities}
     */
    public static Vp9DeltaProbabilities allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9DeltaProbabilities newInstance = new Vp9DeltaProbabilities(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp9DeltaProbabilities proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9DeltaProbabilities(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9DeltaProbabilities> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9DeltaProbabilities(input);
    
    /**
     * A {@link Vp9DeltaProbabilities.Builder} object constructs a {@link Vp9DeltaProbabilities} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9DeltaProbabilities.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9DeltaProbabilities struct;
        
        private Builder() {
            struct = Vp9DeltaProbabilities.allocate();
        }
        
        /**
         * Finish building the {@link Vp9DeltaProbabilities} struct.
         * @return A new instance of {@code Vp9DeltaProbabilities} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9DeltaProbabilities build() {
            return struct;
        }
        
        public Builder setTxProbs8x8(byte[] txProbs8x8) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_8x8"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (txProbs8x8 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs8x8, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setTxProbs16x16(byte[] txProbs16x16) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_16x16"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (txProbs16x16 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs16x16, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setTxProbs32x32(byte[] txProbs32x32) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_32x32"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (txProbs32x32 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs32x32, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setCoef(byte[] coef) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("coef"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (coef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(coef, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setSkip(byte[] skip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skip == null ? MemoryAddress.NULL : Interop.allocateNativeArray(skip, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setInterMode(byte[] interMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("inter_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interMode, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setInterpFilter(byte[] interpFilter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interp_filter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interpFilter == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interpFilter, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setIsInter(byte[] isInter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_inter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isInter == null ? MemoryAddress.NULL : Interop.allocateNativeArray(isInter, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setCompMode(byte[] compMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("comp_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (compMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(compMode, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setSingleRef(byte[] singleRef) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("single_ref"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (singleRef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(singleRef, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setCompRef(byte[] compRef) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("comp_ref"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (compRef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(compRef, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setYMode(byte[] yMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(yMode, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setPartition(byte[] partition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("partition"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (partition == null ? MemoryAddress.NULL : Interop.allocateNativeArray(partition, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setMv(org.gstreamer.codecs.Vp9MvDeltaProbs mv) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mv"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mv == null ? MemoryAddress.NULL : mv.handle()));
                return this;
            }
        }
    }
}
