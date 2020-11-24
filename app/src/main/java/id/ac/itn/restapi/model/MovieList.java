package id.ac.itn.restapi.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovieList {

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("page")
	private int page;

	@SerializedName("results")
	private List<Movie> results;

	@SerializedName("total_results")
	private int totalResults;

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setResults(List<Movie> results){
		this.results = results;
	}

	public List<Movie> getResults(){
		return results;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"total_pages = '" + totalPages + '\'' + 
			",page = '" + page + '\'' + 
			",results = '" + results + '\'' + 
			",total_results = '" + totalResults + '\'' + 
			"}";
		}
}