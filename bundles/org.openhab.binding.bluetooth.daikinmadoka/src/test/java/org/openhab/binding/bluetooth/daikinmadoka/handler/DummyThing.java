/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bluetooth.daikinmadoka.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.semantics.SemanticTag;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingStatus;
import org.openhab.core.thing.ThingStatusDetail;
import org.openhab.core.thing.ThingStatusInfo;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingHandler;

/**
 *
 * @author Benjamin Lafois - Initial contribution
 *
 */
@NonNullByDefault
public class DummyThing implements Thing {

    @Override
    public @Nullable String getLabel() {
        return null;
    }

    @Override
    public void setLabel(@Nullable String label) {
    }

    @Override
    public List<@NonNull Channel> getChannels() {
        return new ArrayList<>();
    }

    @Override
    public List<@NonNull Channel> getChannelsOfGroup(String channelGroupId) {
        return new ArrayList<>();
    }

    @Override
    public @Nullable Channel getChannel(String channelId) {
        return null;
    }

    @Override
    public @Nullable Channel getChannel(ChannelUID channelUID) {
        return null;
    }

    @Override
    public ThingStatus getStatus() {
        return ThingStatus.ONLINE;
    }

    @Override
    public ThingStatusInfo getStatusInfo() {
        return new ThingStatusInfo(ThingStatus.ONLINE, ThingStatusDetail.NONE, "Dummy");
    }

    @Override
    public void setStatusInfo(ThingStatusInfo status) {
    }

    @Override
    public void setHandler(@Nullable ThingHandler thingHandler) {
    }

    @Override
    public @Nullable ThingHandler getHandler() {
        return null;
    }

    @Override
    public @Nullable ThingUID getBridgeUID() {
        return null;
    }

    @Override
    public void setBridgeUID(@Nullable ThingUID bridgeUID) {
    }

    @Override
    public Configuration getConfiguration() {
        return new Configuration();
    }

    @Override
    public ThingUID getUID() {
        return new ThingUID("dummy");
    }

    @Override
    public ThingTypeUID getThingTypeUID() {
        return new ThingTypeUID("dummy");
    }

    @Override
    public Map<@NonNull String, @NonNull String> getProperties() {
        return new HashMap<>();
    }

    @Override
    public @Nullable String setProperty(String name, @Nullable String value) {
        return null;
    }

    @Override
    public void setProperties(Map<@NonNull String, @NonNull String> properties) {
    }

    @Override
    public @Nullable String getLocation() {
        return null;
    }

    @Override
    public void setLocation(@Nullable String location) {
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void setSemanticEquipmentTag(@Nullable SemanticTag semanticEquipmentTag) {
    }

    @Override
    public void setSemanticEquipmentTag(@Nullable String semanticEquipmentTag) {
    }

    @Override
    public @Nullable String getSemanticEquipmentTag() {
        return null;
    }
}
