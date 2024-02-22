public class Stats {
    public static void main(String[] args) {
        if ("--product".equals(args[0])) {
            double prod = 1;
            for (int i = 1; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                prod *= val;
            }
            System.out.println(prod);
        } else if ("--mean".equals(args[0])) {
            double mean = 0;
            double count = 0;
            for (int i = 1; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                count++;
                mean += val;
            }
            System.out.println(mean/count);
        } else if ("--total".equals(args[0])) {
            double total = 0;
            for (int i = 1; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                total += val;
            }
            System.out.println(total);
        } else if ("--max".equals(args[0])) {
            double max =  Double.parseDouble(args[1]);
            for (int i = 1; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                if (val > max) {
                    max = val;
                }
            }
            System.out.println(max);
        } else if ("--min".equals(args[0])) {
            double min = Double.parseDouble(args[1]);
            for (int i = 1; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                if (val < min) {
                    min = val;
                }
            } 
            System.out.println(min);
        } else {
            System.out.println("Bad option " + args[0]);
        }
    }
}

/*                                     Switch Statements!!, pretty clean
 public class Stats {
    public static void main(String[] args) {
        String option = args[0];
        double[] numbers = new double[args.length - 1];
        
        // Convert command-line arguments to double numbers
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Double.parseDouble(args[i]);
        }
        
        // Check the first command-line argument and perform the corresponding action
        switch (option) {
            case "--product":
                double product = 1;
                for (double num : numbers) {
                    product *= num;
                }
                System.out.println(product);
                break;
            case "--mean":
                double sum = 0;
                for (double num : numbers) {
                    sum += num;
                }
                double mean = sum / numbers.length;
                System.out.println(mean);
                break;
            case "--total":
                double total = 0;
                for (double num : numbers) {
                    total += num;
                }
                System.out.println(total);
                break;
            case "--max":
                double max = Double.MIN_VALUE;
                for (double num : numbers) {
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println(max);
                break;
            case "--min":
                double min = Double.MAX_VALUE;
                for (double num : numbers) {
                    if (num < min) {
                        min = num;
                    }
                }
                System.out.println(min);
                break;
            default:
                System.out.println("Bad option " + option);
                break;
        }
    }
}

 */