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
public class GraveStalkerEntity extends AbyssMobEntity { public GraveStalkerEntity(EntityType<? extends PathAwareEntity> t,World w){super(t,w);stats(18,.34,5,24,2);} protected void initGoals(){commonGoals();} public void tick(){super.tick();if(!getWorld().isClient){if(age%80==0&&getTarget()!=null){setInvisible(true);} if(isInvisible()&&age%80==30)setInvisible(false);}}}
