package ex.help.iph.core.executor;

/**
 * Created by ivanphytsyk on 1/11/18.
 */

import java.util.concurrent.Executor;

/**
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * {@link ex.help.iph.core.interactor.UseCase} out of the UI thread.
 */
public interface ThreadExecutor extends Executor {}