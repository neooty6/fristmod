package com.ayafps.abyssalreign;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.player.*;
import net.minecraft.particle.*;
import net.minecraft.server.world.*;
import net.minecraft.world.*;

package com.ayafps.abyssalreign;
public class FleshboundEntity extends AbyssMobEntity { public FleshboundEntity(EntityType<? extends PathAwareEntity> t,World w){super(t,w);stats(38,.26,6,26,6);} protected void initGoals(){commonGoals();} public void tick(){super.tick();if(!getWorld().isClient){if(getHealth()<getMaxHealth()*.35f&&age%100==0)heal(5);}}}
