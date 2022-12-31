package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(VulkanBufferMemoryAllocator.getType(), VulkanBufferMemoryAllocator.fromAddress);
        Interop.typeRegister.put(VulkanBufferPool.getType(), VulkanBufferPool.fromAddress);
        Interop.typeRegister.put(VulkanCommandPool.getType(), VulkanCommandPool.fromAddress);
        Interop.typeRegister.put(VulkanDescriptorCache.getType(), VulkanDescriptorCache.fromAddress);
        Interop.typeRegister.put(VulkanDescriptorPool.getType(), VulkanDescriptorPool.fromAddress);
        Interop.typeRegister.put(VulkanDevice.getType(), VulkanDevice.fromAddress);
        Interop.typeRegister.put(VulkanDisplay.getType(), VulkanDisplay.fromAddress);
        Interop.typeRegister.put(VulkanFenceCache.getType(), VulkanFenceCache.fromAddress);
        Interop.typeRegister.put(VulkanFullScreenQuad.getType(), VulkanFullScreenQuad.fromAddress);
        Interop.typeRegister.put(VulkanHandlePool.getType(), VulkanHandlePool.fromAddress);
        Interop.typeRegister.put(VulkanImageBufferPool.getType(), VulkanImageBufferPool.fromAddress);
        Interop.typeRegister.put(VulkanImageMemoryAllocator.getType(), VulkanImageMemoryAllocator.fromAddress);
        Interop.typeRegister.put(VulkanInstance.getType(), VulkanInstance.fromAddress);
        Interop.typeRegister.put(VulkanMemoryAllocator.getType(), VulkanMemoryAllocator.fromAddress);
        Interop.typeRegister.put(VulkanPhysicalDevice.getType(), VulkanPhysicalDevice.fromAddress);
        Interop.typeRegister.put(VulkanQueue.getType(), VulkanQueue.fromAddress);
        Interop.typeRegister.put(VulkanSwapper.getType(), VulkanSwapper.fromAddress);
        Interop.typeRegister.put(VulkanTrashFenceList.getType(), VulkanTrashFenceList.fromAddress);
        Interop.typeRegister.put(VulkanTrashList.getType(), VulkanTrashList.fromAddress);
        Interop.typeRegister.put(VulkanVideoFilter.getType(), VulkanVideoFilter.fromAddress);
        Interop.typeRegister.put(VulkanWindow.getType(), VulkanWindow.fromAddress);
    }
}
