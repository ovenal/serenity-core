package net.thucydides.junit.runners;

import com.google.inject.Injector;
import com.google.inject.Module;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.batches.BatchManager;
import net.thucydides.core.webdriver.Configuration;
import net.thucydides.core.webdriver.WebDriverFactory;
import net.thucydides.core.webdriver.WebdriverManager;
import org.junit.runners.model.InitializationError;

/**
 * @deprecated Replaced by SerenityRunner
 *
 * Provided for backwards compatibility
 */
@Deprecated
public class ThucydidesRunner extends SerenityRunner {
    public ThucydidesRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    public ThucydidesRunner(Class<?> klass, Module module) throws InitializationError {
        super(klass, module);
    }

    public ThucydidesRunner(Class<?> klass, Injector injector) throws InitializationError {
        super(klass, injector);
    }

    public ThucydidesRunner(Class<?> klass, WebDriverFactory webDriverFactory) throws InitializationError {
        super(klass, webDriverFactory);
    }

    public ThucydidesRunner(Class<?> klass, WebDriverFactory webDriverFactory, Configuration configuration) throws InitializationError {
        super(klass, webDriverFactory, configuration);
    }

    public ThucydidesRunner(Class<?> klass, WebDriverFactory webDriverFactory, Configuration configuration, BatchManager batchManager) throws InitializationError {
        super(klass, webDriverFactory, configuration, batchManager);
    }

    public ThucydidesRunner(Class<?> klass, BatchManager batchManager) throws InitializationError {
        super(klass, batchManager);
    }

    public ThucydidesRunner(Class<?> klass, WebdriverManager webDriverManager, Configuration configuration, BatchManager batchManager) throws InitializationError {
        super(klass, webDriverManager, configuration, batchManager);
    }
}
