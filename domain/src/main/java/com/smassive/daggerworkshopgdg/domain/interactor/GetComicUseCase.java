/**
 * Copyright (C) 2016 Sergi Castillo Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.smassive.daggerworkshopgdg.domain.interactor;

import com.smassive.daggerworkshopgdg.domain.bean.ComicBo;
import com.smassive.daggerworkshopgdg.domain.exception.ErrorBundle;

/**
 * Get comic by comic identifier use case.
 */
public interface GetComicUseCase extends Interactor {

    /**
     * Callback used to be notified when either a comic has been loaded or an error happened.
     */
    interface Callback {
        void onComicDetailLoaded(ComicBo comicBo);
        void onError(ErrorBundle errorBundle);
    }

    /**
     * Executes this use case.
     *
     * @param comicId int comic identifier which we want to retrieve information.
     * @param callback A {@link GetComicUseCase.Callback} used for notify the client.
     */
    public void execute(int comicId, Callback callback);
}
