package singleton;

public class Database {
		private String connectionString="ww.mydb.ro";
		
		private Database() {
			connect();
		}
		
		private void connect() {
			//connect to db
			
		}
		
		public static Database INSTANCE=null;
		
		//Singleton lazy initialozation- NOT thread safe
		public static Database getInstance() {
			if(INSTANCE==null) {
				INSTANCE=new Database();
			}
			return INSTANCE;
		}
}
