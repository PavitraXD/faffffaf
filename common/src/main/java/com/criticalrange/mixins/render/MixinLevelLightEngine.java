package com.criticalrange.mixins.render;

import com.criticalrange.VulkanModExtra;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.light.LightingProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Light updates control mixin - SAFE implementation
 * Provides light throttling when enabled, minimal interference when disabled
 */
@Mixin(LightingProvider.class)
public class MixinLevelLightEngine {
    private static int throttleCounter = 0;

    @Inject(at = @At("HEAD"), method = "doLightUpdates", cancellable = true)
    public void vulkanmodExtra$throttleLightUpdates(CallbackInfoReturnable<Integer> cir) {
        // Disabled - let vanilla handle all lighting for proper player brightness
    }
}
