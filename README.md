# CPIT-252 Lab-2 (Singleton) - Abdulrahman Alosaimi


## What was wrong
We need a single instance of Logger for the program instead of a new logger for each instance. However both the Shipment and Order classes create their own seperate instances of Logger.

## How to fix it
Prevent classes from creating new instances of Logger by making the constructor private.

    private Logger() { ... }

Create a static instance of the Logger class.

    public class Logger {
    ...
    private static Logger logger = null;
    ...
    }

Create a static method that instantiates the logger instance if it wasn't instantiated before.

    public static Logger getLogger(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

Replace all instantiations in other classes to the static method.

    Shipment.Java
    
    public class Shipment {
    ...
    private Logger log = Logger.getLogger();
    ...
    }


	Order.Java
	
    public class Order {
    ...
    private Logger log = Logger.getLogger();
    ...
    }
