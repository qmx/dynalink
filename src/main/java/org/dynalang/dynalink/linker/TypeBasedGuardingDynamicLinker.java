/*
   Copyright 2009-2012 Attila Szegedi

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.dynalang.dynalink.linker;

/**
 * A guarding dynamic linker that can determine whether it can link the call site solely based on the type of the first
 * argument at linking invocation time. (The first argument is usually the receiver class). Most language-specific
 * linkers will fall into this category, as they recognize their native objects as Java objects of classes implementing
 * a specific language-native interface or superclass. The linker mechanism can optimize the dispatch for these linkers.
 *
 * @author Attila Szegedi
 */
public interface TypeBasedGuardingDynamicLinker extends GuardingDynamicLinker {
    /**
     * Returns true if the linker can link an invocation where the first argument (receiver) is of the specified type.
     *
     * @param type the type to link
     * @return true if the linker can link calls for the receiver type, or false otherwise.
     */
    public boolean canLinkType(Class<?> type);
}
