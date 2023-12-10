package pers.neige.neigeitems.ref.registry;

import org.inksnow.ankhinvoke.comments.HandleBy;

@HandleBy(reference = "net/minecraft/core/DefaultedRegistry", predicates = "craftbukkit_version:[v1_17_R1,)")
public interface RefDefaultedRegistry<T> extends RefRegistry<T> {
}
