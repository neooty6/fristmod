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
public class BloodMawEntity extends AbyssMobEntity { public BloodMawEntity(EntityType<? extends PathAwareEntity> t,World w){super(t,w);stats(45,.22,9,20,5);} protected void initGoals(){commonGoals();} public void tick(){super.tick();if(!getWorld().isClient){if(age%90==0&&getTarget()!=null)tryAttack(getTarget());}}}
