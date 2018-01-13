package ex.help.iph.concurrency

import ex.help.iph.core.executor.ThreadExecutor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@Singleton
class JobExecutor @Inject constructor() : ThreadExecutor {

    private val threadPoolExecutor: ThreadPoolExecutor

    override fun execute(runnable: Runnable?) {
        this.threadPoolExecutor.execute(runnable)
    }

    class JobThreadFactory : ThreadFactory {
        private var counter: Int = 0;
        override fun newThread(runnable: Runnable?): Thread {
            return Thread(runnable, "HelpEx thread " + counter++)
        }

    }

    init {
        threadPoolExecutor = ThreadPoolExecutor(3, 8, 10,
                TimeUnit.SECONDS, LinkedBlockingQueue(), JobThreadFactory())
    }
}
