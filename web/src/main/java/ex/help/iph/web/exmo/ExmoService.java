package ex.help.iph.web.exmo;

import ex.help.iph.web.exmo.ExmoApi;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by ivanphytsyk on 1/11/18.
 */

public enum ExmoService {
    INSTANCE;

    public final ExmoApi exmoApi;

    ExmoService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://exmo.me")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        exmoApi = retrofit.create(ExmoApi.class);
    }
}
