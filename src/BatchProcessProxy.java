public class BatchProcessProxy implements BatchProcess {

        private BatchProcessReal batchProcess;
        private String fileName;

        public BatchProcessProxy(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void process() {
            if (batchProcess == null) {
                batchProcess = new BatchProcessReal(fileName);
            }
            batchProcess.process();
        }
    }

