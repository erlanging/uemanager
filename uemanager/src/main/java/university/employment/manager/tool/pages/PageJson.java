package university.employment.manager.tool.pages;

import java.util.List;

@SuppressWarnings("rawtypes")
public class PageJson {
	private List rows;
	private int total;

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
