package ex.help.iph.core.repository;

import ex.help.iph.core.model.UserInfo;
import io.reactivex.Observable;

/**
 * Created by ivanphytsyk on 1/12/18.
 */

public interface UserSession {
    boolean isLoggedIn(String exchangeCode);
    Observable<UserInfo> login(String login);
}
