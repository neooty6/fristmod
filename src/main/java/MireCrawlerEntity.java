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
public class MireCrawlerEntity extends AbyssMobEntity { public MireCrawlerEntity(EntityType<? extends PathAwareEntity> t,World w){super(t,w);stats(22,.34,4.5,22,2);} protected void initGoals(){commonGoals();} public void tick(){super.tick();if(!getWorld().isClient){if(age%90==0&&getTarget()!=null)getTarget().addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,60,1));}}}
